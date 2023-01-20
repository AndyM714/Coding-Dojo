const express = require('express');
const app = express()

const {faker} = require('@faker-js/faker');


app.get('/api/user/new', (req, res) => {
    const createUser= {
    username: faker.internet.userName(),
    }
    res.json(createUser);
});

app.get('/api/companies/new', (req, res) => {
    const createCompany= {
    Company: faker.company.companyName(),
    }
    res.json(createCompany);
});

app.get('/api/user/company', (req, res) => {
    const createCompanyUser= {
    Company: faker.company.companyName(),
    User: faker.internet.userName(),
    }
    res.json(createCompanyUser);
});


const PORT = 5001;
app.listen(PORT, () => {
    console.log(`listening on ${PORT}`);
});

