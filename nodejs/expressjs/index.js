import express from 'express';
import cors from 'cors';
import * as dotenv from 'dotenv';
import {databasePool} from "./config/database.js";

dotenv.config();

const PORT = process.env.PORT || 3030
const app = express();

app.use(express.json())
app.use(cors())

app.listen(PORT, async () => {
    const pool = await databasePool.connect().then(() => {
        console.log("Database connected successfully ");
    }).catch(error => {
        console.log(error);
    });

    await databasePool.query("CREATE TABLE IF NOT EXISTS minified_url (identifier CHAR(36), original_url VARCHAR, url_id CHAR(6))")
    console.log("ignition started on port:" + PORT);
})