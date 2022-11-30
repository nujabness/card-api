# Card API

- Date : **11/2022**
- Subject: *CARD API*
- Project : *Spring Boot Card API*

## Auteur(s)

|Nom|Prénom|
|--|--|
*EL ASSOURI* | *Mohammed*|

## How to start
  ```shell
    mvnw spring-boot:run
  ```

## Routes

- Get Deck
    - **Path:**: localhost:8080/cards/deck
    - **Method:** GET

- **Exemple Response :**
```json
  {
    "shuffledCards": [
       {
          "color": "CLUBS",
          "rank": "8"
       },
    ],
    "sortedCards": [
       {
          "color": "SPADES",
          "rank": "9"
       },
       {
          "color": "SPADES",
          "rank": "3"
      },
      {
          "color": "SPADES",
          "rank": "4"
      },
      {
          "color": "CLUBS",
          "rank": "8"
      },
    ],
    "orderColors": [
      "SPADES",
      "CLUBS",
      "HEARTS",
      "DIAMONDS"
    ],
    "orderRanks": [
      "K",
      "8",
      "10",
      "7",
      "A",
      "..."
    ]
  }
```
- **Interface Vue3 : localhost:8080**


![alt text](https://github.com/nujabness/card-api/blob/main/ui.png)
