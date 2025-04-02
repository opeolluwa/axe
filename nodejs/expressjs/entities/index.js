import {PrimaryGeneratedColumn, Entity, Column, BeforeInsert} from "typeorm";
import {ulid} from "ulid";
import {nanoid} from "nanoid";

@Entity()
export default class MinifiedUrl {
    @PrimaryGeneratedColumn()
    identifier: string

    @Column()
    originalUrl: string

    @Column()
    keyTag: string

    @BeforeInsert()
    setDefaults() {
        this.identifier = ulid();
        this.keyTag = nanoid(6);
    }
}