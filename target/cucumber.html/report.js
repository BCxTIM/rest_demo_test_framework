$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("book.feature");
formatter.feature({
  "line": 1,
  "name": "rest feature",
  "description": "",
  "id": "rest-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 61596366,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Run rest",
  "description": "",
  "id": "rest-feature;run-rest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "get all books",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "count of books is 0",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "add new book",
  "rows": [
    {
      "cells": [
        "title",
        "author"
      ],
      "line": 8
    },
    {
      "cells": [
        "tim",
        "moiseev"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "count of books is 1",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "get book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify that title is tim and author is moiseev for book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "update book with id 1",
  "rows": [
    {
      "cells": [
        "title",
        "author"
      ],
      "line": 14
    },
    {
      "cells": [
        "jora",
        "hui"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "get book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify that title is jora and author is hui for book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "add new book",
  "rows": [
    {
      "cells": [
        "title",
        "author"
      ],
      "line": 19
    },
    {
      "cells": [
        "bro",
        "pon4ik"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "verify that title is bro and author is pon4ik for book by id 2",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "get book by id 2",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "delete book id 1",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "count of books is 1",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "book with title bro and author pon4ik is stored in db by id 2",
  "keyword": "And "
});
formatter.match({
  "location": "RestSteps.getAllBooks()"
});
formatter.result({
  "duration": 748703779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 18
    }
  ],
  "location": "RestSteps.countOfBooksIsNumber(int)"
});
formatter.result({
  "duration": 16327851,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.addNewBook(DataTable)"
});
formatter.result({
  "duration": 84063197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    }
  ],
  "location": "RestSteps.countOfBooksIsNumber(int)"
});
formatter.result({
  "duration": 21198407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "RestSteps.getBookByid(int)"
});
formatter.result({
  "duration": 17408106,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tim",
      "offset": 21
    },
    {
      "val": "moiseev",
      "offset": 39
    },
    {
      "val": "1",
      "offset": 62
    }
  ],
  "location": "RestSteps.verifyBook(String,String,int)"
});
formatter.result({
  "duration": 19088788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "RestSteps.updateBookWithId(int,DataTable)"
});
formatter.result({
  "duration": 33694901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "RestSteps.getBookByid(int)"
});
formatter.result({
  "duration": 30282218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jora",
      "offset": 21
    },
    {
      "val": "hui",
      "offset": 40
    },
    {
      "val": "1",
      "offset": 59
    }
  ],
  "location": "RestSteps.verifyBook(String,String,int)"
});
formatter.result({
  "duration": 17925568,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.addNewBook(DataTable)"
});
formatter.result({
  "duration": 14076676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bro",
      "offset": 21
    },
    {
      "val": "pon4ik",
      "offset": 39
    },
    {
      "val": "2",
      "offset": 61
    }
  ],
  "location": "RestSteps.verifyBook(String,String,int)"
});
formatter.result({
  "duration": 11261427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "RestSteps.getBookByid(int)"
});
formatter.result({
  "duration": 13498916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "RestSteps.deleteBookById(int)"
});
formatter.result({
  "duration": 15701764,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    }
  ],
  "location": "RestSteps.countOfBooksIsNumber(int)"
});
formatter.result({
  "duration": 14971330,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bro",
      "offset": 16
    },
    {
      "val": "pon4ik",
      "offset": 31
    },
    {
      "val": "2",
      "offset": 60
    }
  ],
  "location": "DatabaseSteps.bookStoredById(String,String,int)"
});
formatter.result({
  "duration": 286849708,
  "status": "passed"
});
});