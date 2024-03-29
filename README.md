# HT Consulting Internship-
This repository contains all my projects done during my internship with HT Consulting

Notebook file contains all the code and explanations/overviews of how the code works.
Data file contains all my results of altering data samples, it is split into audio, text, and image folders. The backup folder contains the original data samples unaltered.
Requirements file contains all the libraries and tools needed to run the code.
The file labeled "Programming Fundamentals Course" contains all assignments Jimmy has tasked the interns/new employees with.

Below is a summary of all tasks completed in each week:

## Week 1
- Familiarize and experiment with OS libraries to handle file moving and sorting.
- Familiarize and experiment with pandas, matplotlib, and numpy libraries to learn to plot graphs and convert data into numpy arrays
- Convert audio files into spectrograms with pytorch
- Pandas was used to alter and read csv files.
- Learn to use jupyter notebook for my source code
- Worked on setting up a github repo for all my projects in this company.
- Access and read valuable properties of images such as formatting type, size, pixels, etc.

## Week 2
- Convert more audio files into spectrograms and then convert them into numpy arrays and tensors.
- Learned more in depth into using pytorch and tensorflow libraries to inspect tensors and other additional things to do.
- Beautify my github repo by organizing files and adding a readme file alongside requirements file. 
- Manually scan cheques to help create datasets for another team working on a project.
- We got to see how a cheque scanning machine works on the inside and errors to look out for in these machines.

## Week 3
- During this week I was given multiple large datasets that consisted of images and csv files. For each dataset I was tasked to plot appropriate graphs of certain features of each of this data using matplotlib, seaborn,     and plotly libraries.
- I learned key terms to know when handling big data such as mean, standard deviation, right/left-skewed graphs, etc.
- I was tasked with generating code to separate images based on the labels given in their corresponding csv data file.

## Week 4
- I learned to use libraries such as tensorflow, scikit-learn, and pytorch to get familiar with making and training AI models.
- I was given 2 datasets: one being of images of cats and dogs, another with a csv dataset of all passengers of the titanic. I was tasked to train an AI model to differentiate between cats and dogs for the image dataset     and predict which passengers would survive in the csv dataset. I had to use all 3 different libraries for each dataset
- I learned generally on loading data, preprocessing data, choosing features and prediction target, splitting data into training, validation, and testing segments, structuring/designing an AI model, training the AI model,     evaluating its performance, testing the model on new data, and saving the model.

## Week 5
- I was given tasks that were related to the previous week regarding the AI image classification model ; Generally, I had to plot graphs and tabulate data of the accuracies of my AI model based on their corresponding       number of images used for training the model.
- Graphs discovered shows a positive increase in accuracy of a model when number of images per class for training increased, however there was a significant plateau at a certain point. This was to help familiarize the       optimum number of images needed to train a model such that I avoid overfitting.
- I learned from my peers to use YOLO which is an object detection model so that I can assist them in their work to detect signatures, names, date, etc. on a bank cheque.
- I also researched other AI models such as detecto and roboflow.
- I then had to label and train sets of bank cheque images ranging from 10, 100, 250, 500, and 1000 images per class and evaluate each model’s performance.

## Week 6
- I had to bug fix the YOLO object detection source code as it could not detect my GPU and thus the model training took a long amount of time to train.
- ### Programming Fundamentals Course
  - This was the start of Jimmy’s assignments. He had given us tasks to experiment with bit manipulation and discover the booth algorithm.
  - I had to implement functions to set bits, convert decimals to binary, unset bits, find max number of a short data type, and the booth algorithm.

## Week 7
- During this week, I had to retrain some datasets using the YOLO object detection model as some data was inaccurate/lost. I also had to plot their performance on a graph and tabulate information such as image per class     size, mAP accuracies, and accuracy on random bank cheque image samples, both coloured and grayscale.
- ### Programming Fundamentals Course
  - I had to learn to differentiate the performances of switch-case statements and if-else statements; I had to implement functions that used both methods to give an output of number of days based on the month passed into     the function.
  - I also had to implement a function that converts all letters of a string to uppercase, in recursive manner, and pass by reference.
  - I also had to implement a function that prints all possible combinations of a string given the number of letters, and length of string.

## Week 8
- More bug fixing was needed for YOLO as the model couldn't detect my gpu
- ### Programming Fundamentals Course
  - I had to implement a stack, and then use the stack to modify my to uppercase function from before such that instead of working recursively, it instead works in a while loop utilizing the stack to store the letters of      a string. This function also had to work by passing variables by value.
  - I also had to implement a binary tree alongside tree depth reversal functions.
  - I also had to research on how binary trees worked.

## Week 9
- Fixed my YOLO such that my gpu is used for training the model instead of my cpu. I found out that I was using an old version of YOLO and thus it was not compatible with my cuda and cudnn versions.
- Helped Mark and Afif to label an extra 150 images for their bank cheque dataset. It consisted of manually drawing boxes around objects on a cheque that was meant to be detected; signature, name, MICR, date, amount, etc.
- I then trained the model with the whole dataset combined which consisted of 600 total images, the training time was much faster (by a total of 2 hours) since my gpu was detected this time. The dataset was split into       training, test, and validation with a ratio of 70% : 20% : 10% respectively.
- ### Programming Fundamentals Course
  - During this week, Jimmy had assigned us to modify our Binary Tree implementation such that stacks were used to store the nodes instead of recursion.
  - In addition to that he had also tasked us to experiment with processes colliding; we had to implement a burger station that has 5 counters simultaneously selling burgers by decrementing a number stored in a mysql          database. This was to demonstrate the importance of having locks in multithreading.

## Week 10
- Finished writing report in markdowns in my jupyter notebook for YOLO object detection model training.
- Updated all github pushes, github readme, and monthly reports until this current time.
- Learned from Afif (my senior) on how to use detecto for object detection. Essentially I performed the same tasks as I did with the bank cheques however I used detecto instead of YOLO.
- Performed a interview shooting with my partner for the comapany's internship campaign
- ### Programming Fundamentals Course
  - Learned about rollback, commits, and importance of logs in database transactions.
  - Tasked to implement a binary tree using mySQL database
  - Tasked to implement a syntax checker function that takes in an equation and check if it is mathematically computable
  - Tasked to make a program that simulates a couple of trains running a course on a track, and crash them if they reach the same station simultaneously

## Week 11
- Removed an erroneous preprocessing step when cleaning the dataset used to train both the detecto and YOLO model. (removed the resizing of images to 480 pixels)
- Fixed 'winerror5' occuring while training my YOLO model. It was discovered that since downloading the packages/libraries for detecto, my YOLO model started to have this error popup whenver I tried to train the model.      The problem is due to the fact that both AI models use the same math kernels which causes a conflict. Therefore a line of code is needed before training the model which allows both models to use the same math kernel.
- Re-split all datasets for new images to train detecto and YOLO.
- Fine tuned size of image preprocessing for YOLO to increase accuracy. It should be noted the training time is significantly increased. (resized images = 224 changed to 640)
- Discovered that 640 imgz is too large and causes the model traning to take way too long even with the use of my GPU, therefore it was finalized to use 416 imgz for YOLO.
- Learned to save model trained in Detecto and use it on company bank cheque samples.
- ### Programming Fundamentals Course
  - Learned causes of database crashing.
  - Learned mutex, locks, and semaphores.
  - Had to debug my simulation of trains crashing assignment as my trains never crashed.

## Week 12
- Finished presentation slides and final industrial report for submission.
- Fixed YOLO and DETECTO bugs.
- Added documentation to my DETECTO script
-  ### Programming Fundamentals Course
   - Fixed train.py bugs
   - implemented tree in SQL database   

