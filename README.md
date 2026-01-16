## CS403 Project Milestone 1

### Game: Egyptian Rat Screw (Egyptian War)
Note: The game description and rules have been modified from this website: (https://bicyclecards.com/how-to-play/egyptian-rat-screw/)

Game Description: 
    Egyptian Rat Screw (also known as Egyptian War) is a multiplayer card game (using a standard 52-card deck) with the goal of retaining all of the cards that are in play. 

How to begin: 
    Deal cards one at a time face down to each player until all cards have been evenly dealt. Players are not allowed to look at the cards, but should organize their cards into a neat deck (still facedown). 

Playing the game: 

    The player to the right of whoever dealt the card begins the game. They will take the top card from their deck and put it face-up in the middle of the group. If the card played is a number card (2-10), the player to the right puts down a card in the same manner. 

    This continues until a player puts down a face card or an ace. Each face card/ace (J, Q, K, A) has a corresponding number of cards that the next player must place down, 1, 2, 3, and 4 respectively. If the next player doesn't play a face card/ace within their allotted chances, the person who put the last face card/ace wins the round and the entire pile in the middle goes to them, added face-down to the bottom of their deck. 

    The only thing that overrides the face card/ace play is a slap rule, which is a rule for a set of cards that constitutes the players slapping the pile in the middle. The first player to slap the pile when the slap rule is in effect is the winner of the round, and gets to add the pile to the bottom of their deck.

End of game/Winning:
    The game ends when one person has posession of all of the cards. They are the winner.

Project-specific details: 

    Game Starting Configuration - there will be 4 players, each positioned at a cardinal direction of the playing area (N, S, E, W), and there will be a space in the middle where the cards will be placed. There will be a standard 52-card deck. All cards will be dealt out, meaning each player has a stack of 13 cards face-down. 

    Slap Rules: for this version of the game, the following slap rules will be in effect
        Double - when 2 cards of equivalent value are laid down consecutively (ex: 3, 3)
        Sandwich - when 2 card of equivalent value sandwich another value card (ex: 3, 5, 3)
        Seven - when the "7" card is placed down
        Marriage - when a queen is placed over or under a king (ex: Q, K or K, Q)

    4 Distinct Strategies - the strategies for each player will be as follows
        Player 1 -> Doesn't slap at all
        Player 2 -> Slaps every card right before their turn
        Player 3 -> Slaps only when face cards/aces have been placed down
        Player 4 -> Slaps only when slap rules are in effect

    Slap Simulation:
        In real life, the slap rule winner would be based on whoever has the fastest reflexes and can slap the pile first. To simulate that, each player will have a randomly generated number between 0.1 and 1.5, which represents the time (in seconds) it takes to "slap" the pile. Whoever has the lowest number wins the round. 
