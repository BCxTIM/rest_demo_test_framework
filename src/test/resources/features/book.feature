Feature: rest feature

  @Run
  Scenario: Run rest
    Given get all books
    And count of books is 0
    When add new book
      | title | author  |
      | tim   | moiseev |
    And count of books is 1
    And get book by id 1
    And verify that title is tim and author is moiseev for book by id 1
    And update book with id 1
      | title | author |
      | jora  | hui    |
    And get book by id 1
    And verify that title is jora and author is hui for book by id 1
    When add new book
      | title | author |
      | bro   | pon4ik |
    And verify that title is bro and author is pon4ik for book by id 2
    And get book by id 2
    And delete book id 1
    And count of books is 1
    And book with title bro and author pon4ik is stored in db by id 2


