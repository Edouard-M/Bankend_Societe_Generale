# **bankend** - Société Générale

### Author : *Edouard Mignien*

### **Prerequisites**

Node is required in order to run this app.
You can get it [here](https://nodejs.org/en/download/).

### **How to run**

1. Clone this repository or download it as zip.
   
2. Inside the root directory, execute the following command to install the modules:

    ```
    npm install
    ```

3. Then execute the following command to run the tests:

    ```
    npm test
    ```

4. Then execute the following command to start the server:

    ```
    npm start
    ```

5. Then execute the following command to interact:

    *To see the balance :*
    ```
    curl http://localhost:3001/balance
    ```

    *To deposit an amount :*
    ```
    curl -X POST http://localhost:3001/deposit -d '{"number":15}' -H "Content-type: application/json"
    ```

    *To withdraw an amount :*
    ```
    curl -X POST http://localhost:3001/withdraw -d '{"number":10}' -H "Content-type: application/json"
    ```

    *To see the account history :*
    ```
    curl http://localhost:3001/history
    ```

## **Code Structure**

The project contains 3 source files :

- **bank.js :** contains the backend functions of the bank that implements the following features :
  - *deposit an amount in the balance*
  - *withdraw an amount from the balance*
  - *add a statement in the history*
  - *show the history*
- **bank.test.js :** contains the unit tests of the bank's functions
- **app.js :** REST api which allow the following interactions :
  - *GET http://localhost:3001/balance* <sub>(show the balance)</sub>
  - *POST http://localhost:3001/deposit  {"number":value}* <sub>(add 'amount' to the balance)</sub>
  - *POST http://localhost:3001/withdraw  {"number":value}* <sub>(withdraw 'amount' from the balance)</sub>
  - *GET http://localhost:3001/history* <sub>(show the complete history of the account)</sub>
