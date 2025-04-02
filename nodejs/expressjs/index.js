import express from 'express';
import cors from 'cors';
import * as dotenv from 'dotenv';

// import {AppDataSource} from "./config/database.js";

dotenv.config();

const PORT = process.env.PORT || 3030
const app = express();

app.use(express.json())
app.use(cors())

app.listen(PORT, async () => {
    // AppDataSource.initialize().then(status => {
    //     console.log(status)
    // }).catch(err => console.log(err))
    console.log("ignition started on port:" + PORT);
})