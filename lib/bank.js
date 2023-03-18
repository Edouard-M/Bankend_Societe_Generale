
var balance = 0;

var history = []; 


module.exports = {

    clear: () => {
        balance = 0
        history = []
    },

    get_balance: () => {
        return balance;
    },

}