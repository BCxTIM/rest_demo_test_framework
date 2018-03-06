Feature: rest feature

  @Run
  Scenario: Run rest
    #Rest steps
    Given get all books
    And count of books is 0
    When add new book
      | title       | author  |
      | Google demo | moiseev |
    And count of books is 1
    And get book by id 1
    And verify that title is Google demo and author is moiseev for book by id 1
    And update book with id 1
      | title | author |
      | Apple | victor |
    And get book by id 1
    And verify that title is Apple and author is victor for book by id 1
    When add new book
      | title | author |
      | Windows  | pon4ik |
    And verify that title is Windows and author is pon4ik for book by id 2
    And get book by id 2
    And delete book id 1
    And count of books is 1
    #Database step
    And book with title Windows and author pon4ik is stored in db by id 2


