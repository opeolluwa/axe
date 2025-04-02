import {databasePool} from "../config/database.js";
import {MinifiedUrlRepository} from "../repositories/index.js";
import MinifiedUrlService from "../services/index.js";

const appRepository = new MinifiedUrlRepository(databasePool)
const appService = new MinifiedUrlService(appRepository)

export async function minifyUrl() {
    return appService.createMinifiedUrl()
}

export async function getMinifiedUrl() {
    return appService.findMinifiedUrl()
}

