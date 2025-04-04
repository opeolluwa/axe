import { ulid } from "ulid";
import { nanoid } from "nanoid";

export class MinifiedUrlRepository {
  databaseConnectionPool = null;

  constructor(pool) {
    this.databaseConnectionPool = pool;
  }

  async createMinifiedUrl(originalUrl) {
    const identifier = ulid();
    const urlId = nanoid(6);
    await this.databaseConnectionPool.query(
      "INSERT INTO minified_url (identifier, original_url, url_id) VALUES ($1, $2, $3)",
      [identifier, originalUrl, urlId]
    );
  }

  async deleteMinifiedUrl() {}

  async getMinifiedUrl() {}
}
