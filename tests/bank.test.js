const bank = require('../lib/bank.js')

beforeEach(() => {
    bank.clear()
});

describe('balance', () => {

    test('verify balance amount is 0', () => {
        expect(bank.get_balance()).toBe(0);
    });
});

describe('Deposit', () => {

    test('adding amount', () => {
        var amount = 10;
        expect(bank.deposit(amount)).toBe(amount);
    });

    test('try to add a negative amount', () => {
        var amount = -10;
        expect(bank.deposit(amount)).toBe(-1);
    });
});

describe('history', () => {
    test('get empty history', () => {
        expect(bank.get_history()).toStrictEqual([]);
    });

    test('add an operation', () => {
        var amount = 10;
        var operation = "deposit"
        var statement = {date : new Date(), operation : operation, amount : amount, balance : 0};
        //Verify that the return statement is correct
        expect(bank.add_operation(operation, amount)).toStrictEqual(statement);

        //Verify that the history is correct
        expect(bank.get_history().at(0)).toStrictEqual(statement);
    });
});