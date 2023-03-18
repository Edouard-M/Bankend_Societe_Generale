const express = require('express')
const http = require('http')
const bank = require('./lib/bank.js')

const app = express()
const server = http.createServer(app)
const port = 3001

app.use(express.json())

app.get('/balance', (req, res) => {
    result = bank.get_balance();
    res.status(200).json(result)
})

app.get('/history', (req, res) => {
    result = bank.get_history();
    res.status(200).json(result)
})

app.post('/deposit', (req, res) => {

    if (req.body.number !== undefined) {
        result = bank.deposit(req.body.number)
        res.status(200).json(result)
    }
    else 
        res.status(400).json("bad request") 
})

//default route
app.use('*', (req, res) => {
    res.status(404).json('not found')
})

server.listen(port, () => {
    console.log(`Server is listening to requests at http://localhost:${port}`) 
})
  