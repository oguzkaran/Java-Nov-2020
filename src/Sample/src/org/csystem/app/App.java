/*--------------------------------------------------------------------------------------------------------------------
    Homework-016 için bir ipucu. Detaylar görmezden gelindi
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Card[] deck;

        deck = Card.getShuffledDeck();

        for (Card c : deck)
            System.out.println(c.toString());

    }
}

class Card
{
    private CardValue m_value;
    private CardType m_type;

    public Card(CardValue value, CardType type)
    {
        m_value = value;
        m_type = type;
    }

    //...

    public String toString()
    {
        return String.format("%s-%s", m_type.toString(), m_value.toString());
    }

    //...
    public static Card[] getShuffledDeck()
    {
        Card[] deck = new Card[52];

        int i = 0;

        for (CardType type : CardType.values())
            for (CardValue value : CardValue.values())
                deck[i++] = new Card(value, type);

        //...
        return deck;
    }

    //...
}

enum CardType
{
    SPADE, CLUB, DIAMOND, HEART
}

enum CardValue
{
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNAVE, QUEEN, KING, ACE
}



