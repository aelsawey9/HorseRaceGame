# Animal Race

__Unfortunately, this project is incomplete due to a few reasons, one of them being that this project seemed way too ambitious for me especially that I took a chance to explore with GUIs. The program does compile and all however it is lacking a lot of functionality still. Below shows what the program was intended to look like however not all of the classes below are complete.__

### Goal:
This should be an animal race where different breeds of animals race with multiple users hopefully able to play simultaneously if I implement a server side mechanism where the users can compete from different machines and live stream it on the game screen itself.

### Input:
The user interaction should only be using the mouse most of the time plus entering the animal and player names

### Output:
The user should see the animal icons popup and move on the screen and some windows popup when clicking buttons whether they are warnings, the gamescreen itself.

## Class Goals:
### Animal :
This class is an abstract class where the other animal classes will essentially extend it and set its properties to whatever they need to be; for example, the animal class has an Image and ImageIcon properties which each animal will set accordingly to provide the image of the appropriate animal. As well as containing the x and y position of each individual animal which will be set and changed by other classes in order to output their icons in the appropriate locations on the screen.

## Animal Panel:
It should essentially be the north section of the BorderLayout game screen where the user willl enter a player and animal name as well as select an animal using the buttons representing each animal where the animal's icon will pop up on the screen in lane 1 only if all three actions have been completed. Otherwise, a new JFrame will popup informing the user what they should do exactly.

## App :
This class is essentially my main function which will start the whole app up by calling the MainMenu() object

## Bet :
This class should have implemented a betting mechanism where it will hold the money placed on an animal and which animal it was placed on exactly and deal with how much the user will take if the animal actually won and stuff like that.

## Cheetah:
This class extends Animal and sets it properties and ImageIcons to the approriate icon

## GameScreen:
This is the actual screen of the game where it will contain all the buttons, fields and the track itself where the user will interact with and then this class will be the controller of all the elements on it where all the JPanels and other compoenents will interact with to keep a streamlined communication between classes.

## Horse:
It will extend Animal again and set the ImageIcons appropriately.

## MainMenu:
This will start up the program and will be the biggest main controller of the whole program where it will contain everything in this program and it will use other classes' setMain() function in order to tell the other classes I am Main and you can communicate with me/go through me to reach other classes/data. Also, this class will contain the actual data structure of animals to be used which is a HashMap using the animal's name as the key. Moreover, this class should have a method that deals with movement too to increment each animal's x and y positions.

## OptionsPanel:
This is a class extending JPanel which will contain the 2 buttons on the hommescreen/main menu and it will control what happens when they are clicked along with the MainMenu class.

## Player:
This class was made to instantiate a player where they will have a lot of attributes and this would have been useful only if the server side mutliplayer aspect of this game was implemented, otherwise I would have tailored the experince to only one player without needing to instantiate a whole Player object for only one player.

## Rabbit:
It will extend Animal again and set the ImageIcons appropriately.

## Turtle:
It will extend Animal again and set the ImageIcons appropriately.

## Visual:
This class would extend JPanel as well and print the track base image which would be used to show the actual animal race by overriding the paint method of the component and draw the animals there as well.




