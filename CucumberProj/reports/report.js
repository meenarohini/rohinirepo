$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/firsttest.feature");
formatter.feature({
  "line": 2,
  "name": "This is my first feature file",
  "description": "",
  "id": "this-is-my-first-feature-file",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@abc"
    }
  ]
});
formatter.before({
  "duration": 198986,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "My second scenario",
  "description": "",
  "id": "this-is-my-first-feature-file;my-second-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tag2"
    },
    {
      "line": 12,
      "name": "@mobile"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am in the website",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on some button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I enter a text in a box",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should get another text",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "page should be navigated",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I am in the website",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter a integral data as 345",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I enter a decimal data as 45.67",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter a decimal data as string \"45.67\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the following data should be received",
  "rows": [
    {
      "cells": [
        "Name",
        "Roll No",
        "Class"
      ],
      "line": 24
    },
    {
      "cells": [
        "Raju",
        "45",
        "7"
      ],
      "line": 25
    },
    {
      "cells": [
        "Sai",
        "56",
        "10"
      ],
      "line": 26
    },
    {
      "cells": [
        "Suresh",
        "42",
        "9"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Definations.i_am_in_the_website()"
});
formatter.result({
  "duration": 134804894,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_click_on_some_button()"
});
formatter.result({
  "duration": 202007,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_enter_a_text_in_a_box()"
});
formatter.result({
  "duration": 106855,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_should_get_another_text()"
});
formatter.result({
  "duration": 156319,
  "status": "passed"
});
formatter.match({
  "location": "Definations.page_should_be_navigated()"
});
formatter.result({
  "duration": 294136,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_am_in_the_website()"
});
formatter.result({
  "duration": 131398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "345",
      "offset": 27
    }
  ],
  "location": "Definations.i_enter_a_integral_data_as(int)"
});
formatter.result({
  "duration": 3859260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "45",
      "offset": 26
    },
    {
      "val": "67",
      "offset": 29
    }
  ],
  "location": "Definations.i_enter_a_decimal_data_as(int,int)"
});
formatter.result({
  "duration": 546360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "45.67",
      "offset": 34
    }
  ],
  "location": "Definations.i_enter_a_decimal_data_as_string(String)"
});
formatter.result({
  "duration": 1508060,
  "status": "passed"
});
formatter.match({
  "location": "Definations.the_following_data_should_be_received(DataTable)"
});
formatter.result({
  "duration": 15143283,
  "status": "passed"
});
formatter.after({
  "duration": 183882,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "This is my third scenario outline",
  "description": "",
  "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@mouse"
    },
    {
      "line": 29,
      "name": "@mobile"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am in the website",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I click on some button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I enter a text in a box",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter comodity as \"\u003cComodity\u003e\" with count \u003cNo of Items\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "color as \"\u003cColor\u003e\" and price as \u003cPrice\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the following data should be received",
  "rows": [
    {
      "cells": [
        "Name",
        "Roll No",
        "Class"
      ],
      "line": 37
    },
    {
      "cells": [
        "Raju",
        "45",
        "7"
      ],
      "line": 38
    },
    {
      "cells": [
        "Sai",
        "56",
        "10"
      ],
      "line": 39
    },
    {
      "cells": [
        "Suresh",
        "42",
        "9"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;",
  "rows": [
    {
      "cells": [
        "Comodity",
        "No of Items",
        "Color",
        "Price"
      ],
      "line": 43,
      "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;;1"
    },
    {
      "cells": [
        "Thread",
        "5",
        "Blue",
        "20"
      ],
      "line": 44,
      "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;;2"
    },
    {
      "cells": [
        "Bedsheet",
        "6",
        "Maroon",
        "430"
      ],
      "line": 45,
      "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;;3"
    },
    {
      "cells": [
        "Table",
        "2",
        "Yellow",
        "560"
      ],
      "line": 46,
      "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 80425,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "This is my third scenario outline",
  "description": "",
  "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@mobile"
    },
    {
      "line": 1,
      "name": "@abc"
    },
    {
      "line": 29,
      "name": "@mouse"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am in the website",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I click on some button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I enter a text in a box",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter comodity as \"Thread\" with count 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "color as \"Blue\" and price as 20",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the following data should be received",
  "rows": [
    {
      "cells": [
        "Name",
        "Roll No",
        "Class"
      ],
      "line": 37
    },
    {
      "cells": [
        "Raju",
        "45",
        "7"
      ],
      "line": 38
    },
    {
      "cells": [
        "Sai",
        "56",
        "10"
      ],
      "line": 39
    },
    {
      "cells": [
        "Suresh",
        "42",
        "9"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Definations.i_am_in_the_website()"
});
formatter.result({
  "duration": 1146337,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_click_on_some_button()"
});
formatter.result({
  "duration": 133664,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_enter_a_text_in_a_box()"
});
formatter.result({
  "duration": 148012,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thread",
      "offset": 21
    },
    {
      "val": "5",
      "offset": 40
    }
  ],
  "location": "Definations.i_enter_comodity_as_with_count(String,int)"
});
formatter.result({
  "duration": 325098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blue",
      "offset": 10
    },
    {
      "val": "20",
      "offset": 29
    }
  ],
  "location": "Definations.color_as_and_price_as(String,int)"
});
formatter.result({
  "duration": 512378,
  "status": "passed"
});
formatter.match({
  "location": "Definations.the_following_data_should_be_received(DataTable)"
});
formatter.result({
  "duration": 1134254,
  "status": "passed"
});
formatter.after({
  "duration": 136685,
  "status": "passed"
});
formatter.before({
  "duration": 156696,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "This is my third scenario outline",
  "description": "",
  "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@mobile"
    },
    {
      "line": 1,
      "name": "@abc"
    },
    {
      "line": 29,
      "name": "@mouse"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am in the website",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I click on some button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I enter a text in a box",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter comodity as \"Bedsheet\" with count 6",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "color as \"Maroon\" and price as 430",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the following data should be received",
  "rows": [
    {
      "cells": [
        "Name",
        "Roll No",
        "Class"
      ],
      "line": 37
    },
    {
      "cells": [
        "Raju",
        "45",
        "7"
      ],
      "line": 38
    },
    {
      "cells": [
        "Sai",
        "56",
        "10"
      ],
      "line": 39
    },
    {
      "cells": [
        "Suresh",
        "42",
        "9"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Definations.i_am_in_the_website()"
});
formatter.result({
  "duration": 149145,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_click_on_some_button()"
});
formatter.result({
  "duration": 477263,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_enter_a_text_in_a_box()"
});
formatter.result({
  "duration": 166513,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bedsheet",
      "offset": 21
    },
    {
      "val": "6",
      "offset": 42
    }
  ],
  "location": "Definations.i_enter_comodity_as_with_count(String,int)"
});
formatter.result({
  "duration": 404012,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maroon",
      "offset": 10
    },
    {
      "val": "430",
      "offset": 31
    }
  ],
  "location": "Definations.color_as_and_price_as(String,int)"
});
formatter.result({
  "duration": 284319,
  "status": "passed"
});
formatter.match({
  "location": "Definations.the_following_data_should_be_received(DataTable)"
});
formatter.result({
  "duration": 221263,
  "status": "passed"
});
formatter.after({
  "duration": 351151,
  "status": "passed"
});
formatter.before({
  "duration": 177085,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "This is my third scenario outline",
  "description": "",
  "id": "this-is-my-first-feature-file;this-is-my-third-scenario-outline;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@mobile"
    },
    {
      "line": 1,
      "name": "@abc"
    },
    {
      "line": 29,
      "name": "@mouse"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am in the website",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I click on some button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I enter a text in a box",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter comodity as \"Table\" with count 2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "color as \"Yellow\" and price as 560",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the following data should be received",
  "rows": [
    {
      "cells": [
        "Name",
        "Roll No",
        "Class"
      ],
      "line": 37
    },
    {
      "cells": [
        "Raju",
        "45",
        "7"
      ],
      "line": 38
    },
    {
      "cells": [
        "Sai",
        "56",
        "10"
      ],
      "line": 39
    },
    {
      "cells": [
        "Suresh",
        "42",
        "9"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Definations.i_am_in_the_website()"
});
formatter.result({
  "duration": 186525,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_click_on_some_button()"
});
formatter.result({
  "duration": 215599,
  "status": "passed"
});
formatter.match({
  "location": "Definations.i_enter_a_text_in_a_box()"
});
formatter.result({
  "duration": 160849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Table",
      "offset": 21
    },
    {
      "val": "2",
      "offset": 39
    }
  ],
  "location": "Definations.i_enter_comodity_as_with_count(String,int)"
});
formatter.result({
  "duration": 296024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yellow",
      "offset": 10
    },
    {
      "val": "560",
      "offset": 31
    }
  ],
  "location": "Definations.color_as_and_price_as(String,int)"
});
formatter.result({
  "duration": 242407,
  "status": "passed"
});
formatter.match({
  "location": "Definations.the_following_data_should_be_received(DataTable)"
});
formatter.result({
  "duration": 1756886,
  "status": "passed"
});
formatter.after({
  "duration": 540697,
  "status": "passed"
});
});