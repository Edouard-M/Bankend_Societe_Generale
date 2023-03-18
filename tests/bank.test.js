const bank = require('../lib/bank.js')

beforeEach(() => {
    bank.clear()
});

describe('balance', () => {

    test('verify balance amount is 0', () => {
        expect(bank.get_balance()).toBe(0);
    });
});
