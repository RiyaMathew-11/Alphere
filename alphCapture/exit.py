import numpy as np
import face_recognition as fr
import cv2
import os
#importing the necessary dependancies

with open("count.txt","r") as c: #reading the number of people in the shop
    count=int(c.read())
    c.close()

if(count==0):
    print("All Customers Left")
    quit()

video_capture = cv2.VideoCapture(0)

image = fr.load_image_file("Person0.jpg")
face_encoding = fr.face_encodings(image)[0]

known_face_encondings = [face_encoding]
known_face_names = ["Face Detected"]

while(True):
    ret, frame = video_capture.read()

    rgb_frame = frame[:, :, ::-1]

    face_locations = fr.face_locations(rgb_frame)
    face_encodings = fr.face_encodings(rgb_frame, face_locations)

    for (top, right, bottom, left), face_encoding in zip(face_locations, face_encodings):

        matches = fr.compare_faces(known_face_encondings, face_encoding)

        name = "Not Detected"

        face_distances = fr.face_distance(known_face_encondings, face_encoding)

        best_match_index = np.argmin(face_distances)
        if matches[best_match_index]:
            name = known_face_names[best_match_index]

        cv2.rectangle(frame, (left, top), (right, bottom), (0, 0, 255), 2)

        cv2.rectangle(frame, (left, bottom - 35), (right, bottom), (0, 0, 255), cv2.FILLED)
        font = cv2.FONT_HERSHEY_SIMPLEX
        cv2.putText(frame, name, (left + 6, bottom - 6), font, 1.0, (255, 255, 255), 1)

    cv2.imshow('Webcam_facerecognition', frame)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        with open("count.txt", "w") as c:
            count-=1
            c.write(str(count))
            c.close()
        os.remove("Person0.jpg")
        break

video_capture.release()
cv2.destroyAllWindows()