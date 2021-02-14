import cv2 #importing opencv dependancy

limit = int(input("Enter Person Limit"))
with open("count.txt","r") as c:
    count=int(c.read())
    c.close()
cam = cv2.VideoCapture(0) #capturing video here


while True:
    ret, img = cam.read()

    cv2.imshow("Test", img)

    if not ret:
        break

    k=cv2.waitKey(1)

    if k%256==27:
        #Esc Key to Exit
        print("Close")
        break
    elif (count >= limit):
        print("Maximum Occupancy Reached")
        break

    elif k%256==32:
        #Capture Face (Space key)

        print("Person"+str(count)+"saved")
        with open("count.txt","w") as c:
            c.write(str(count+1))
            c.close()
        file='Person'+str(count)+'.jpg'
        cv2.imwrite(file, img)
        count += 1

cam.release
cv2.destroyAllWindows