$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("book.feature");
formatter.feature({
  "line": 1,
  "name": "rest feature",
  "description": "",
  "id": "rest-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 67650244,
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
  "comments": [
    {
      "line": 5,
      "value": "#Rest steps"
    }
  ],
  "line": 6,
  "name": "get all books",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "count of books is 0",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "add new book",
  "rows": [
    {
      "cells": [
        "title",
        "author"
      ],
      "line": 9
    },
    {
      "cells": [
        "Google demo",
        "moiseev"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "count of books is 1",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "get book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify that title is Google demo and author is moiseev for book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "update book with id 1",
  "rows": [
    {
      "cells": [
        "title",
        "author"
      ],
      "line": 15
    },
    {
      "cells": [
        "Apple",
        "victor"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "get book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify that title is Apple and author is victor for book by id 1",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "add new book",
  "rows": [
    {
      "cells": [
        "title",
        "author"
      ],
      "line": 20
    },
    {
      "cells": [
        "Windows",
        "pon4ik"
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "verify that title is Windows and author is pon4ik for book by id 2",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "get book by id 2",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "delete book id 1",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "count of books is 1",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#Database step"
    }
  ],
  "line": 27,
  "name": "book with title Windows and author pon4ik is stored in db by id 2",
  "keyword": "And "
});
formatter.match({
  "location": "RestSteps.getAllBooks()"
});
formatter.result({
  "duration": 1734372220,
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
  "duration": 49211919,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.addNewBook(DataTable)"
});
formatter.result({
  "duration": 521313875,
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
  "duration": 26460269,
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
  "duration": 10306474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google demo",
      "offset": 21
    },
    {
      "val": "moiseev",
      "offset": 47
    },
    {
      "val": "1",
      "offset": 70
    }
  ],
  "location": "RestSteps.verifyBook(String,String,int)"
});
formatter.result({
  "duration": 63175694,
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
  "duration": 46536084,
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
  "duration": 12602124,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple",
      "offset": 21
    },
    {
      "val": "victor",
      "offset": 41
    },
    {
      "val": "1",
      "offset": 63
    }
  ],
  "location": "RestSteps.verifyBook(String,String,int)"
});
formatter.result({
  "duration": 16075962,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.addNewBook(DataTable)"
});
formatter.result({
  "duration": 47397808,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Windows",
      "offset": 21
    },
    {
      "val": "pon4ik",
      "offset": 43
    },
    {
      "val": "2",
      "offset": 65
    }
  ],
  "location": "RestSteps.verifyBook(String,String,int)"
});
formatter.result({
  "duration": 27009806,
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
  "duration": 16915875,
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
  "duration": 21032478,
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
  "duration": 9593146,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Windows",
      "offset": 16
    },
    {
      "val": "pon4ik",
      "offset": 35
    },
    {
      "val": "2",
      "offset": 64
    }
  ],
  "location": "DatabaseSteps.bookStoredById(String,String,int)"
});
formatter.result({
  "duration": 364612699,
  "status": "passed"
});
});