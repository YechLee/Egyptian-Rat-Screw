package menu_commands

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class gameTest extends AnyFunSpec with Matchers {
    describe("Scala Egyptian Rat Screw/Egyptian War"){
        describe("Has a Menu")

        /*** SHOW PLAYER ORDER ***/
        it("can show the player order"){
            val expectedResult = "Apple, Banana, Strawberry, Mango"
            Menu.advancePlayerOrder should be(expectedResult)
        }

        /*** ADVANCE ORDER ***/ 
        it("can advance the player order"){
            val expectedResult = "Apple, Banana, Strawberry, Mango"
            Menu.advancePlayerOrder should be(expectedResult)
        }

        /*** SHOW GAME AREA ***/
        it("can show the game area, to include the position of each player, each of their card decks, and the space in the middle to put cards down"){
            val expectedResult = 
                """
                --- EGYPTIAN RAT SCREW ---

                Current Player Count: 4
                Current Player Order: 
                    Player 1 -> Apple
                    Player 2 -> Banana
                    Player 3 -> Strawberry
                    Player 4 -> Mango
                ______________________________________________
                |                                            |
                |                [Player 1]                  |       
                |                [13 cards]                  |           
                |                                            |
                |                                            |
                |[Player 2]     [Central pile]     [Player 4]|          
                |[13 cards]        [empty]         [13 cards]|
                |                                            |
                |                                            |
                |                 [Player 4]                 |
                |                 [13 cards]                 |
                |                                            |   
                |____________________________________________|
                
                Total number of cards in play: 52
                
                Number of cards currently in the middle: 0

                Players:
                    Apple       |   Cards: 13
                    Banana      |   Cards: 13
                    Strawberry  |   Cards: 13
                    Mango       |   Cards: 13
                """
            
            Menu.showGameArea should be(expectedResult)
        }
    }
}
