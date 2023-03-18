
var balance = 0;

var history = []; 


module.exports = {

    add_operation: (operation, amount) => {
        var date = new Date();
        var statement = {date : date, operation : operation, amount : amount, balance : balance};
        history.unshift(statement);
    
        return statement;
    },

    clear: () => {
        balance = 0
        history = []
    },

    get_balance: () => {
        return balance;
    },

    get_history: () => {
        return history;
    },

}