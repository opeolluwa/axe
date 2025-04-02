import express from 'express';
import cors from 'cors';
import * as dotenv from 'dotenv';

import { databasePool} from "./config/database.js";

dotenv.config();

const PORT = process.env.PORT || 3030
const app = express();

app.use(express.json())
app.use(cors())

app.listen(PORT, async () => {
    await databasePool.connect().then(() => {
        console.log("Database connected successfully ");
    }).catch(error => {
        console.log(error);
    });
    console.log("ignition started on port:" + PORT);
})