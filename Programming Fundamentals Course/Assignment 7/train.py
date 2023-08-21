import threading
import time

class Train:
    def __init__(self, speed, station):
        self.speed = speed
        self.station = station

    def move(self, stop_event):
        count = 0
        while not stop_event.is_set():
            if count == 4:
                count = 0
            else:
                time.sleep(1 / self.speed)
                self.station = stations[count]  
                print(f"Train {self.speed} moved to station {self.station}")
                count += 1

def loop(trainX, trainY, stop_event):
    while not stop_event.is_set() and trainX.station != trainY.station:
        time.sleep(1)
    if trainX.station == trainY.station:
        print(f"Collision at station {trainX.station}")
        stop_event.set()  # Set the stop event to signal the threads to stop

stations = [1, 2, 3, 4, 5]

trainX = Train(1, 0)
trainY = Train(2, 3)

stop_event = threading.Event()

t1 = threading.Thread(target=trainX.move, args=(stop_event,))
t2 = threading.Thread(target=trainY.move, args=(stop_event,))
t3 = threading.Thread(target=loop, args=(trainX, trainY, stop_event))

t1.start()
t2.start()
time.sleep(2) 
t3.start()

t1.join()
t2.join()
t3.join()
