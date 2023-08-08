import mysql.connector
import time
import random

con = mysql.connector.connect(host='localhost', username='root', password='MirkoIsHot1302!', database='inventory')
cursor = con.cursor()

decrement = """
UPDATE burger
SET stock = stock-1
WHERE id=1;
"""

sold=0

stock = """SELECT stock FROM burger"""
while True:
    try:
        cursor.execute(decrement)
        con.commit()
        time.sleep(0.1)
        sold+=1
    except:
        con.rollback

    cursor.execute(stock)
    if cursor.fetchall().pop(0)[0] <= 0:
        break

con.close()
file = open('./sold.txt', 'a')
file.write('\n'+"Counter 3: "+str(sold))