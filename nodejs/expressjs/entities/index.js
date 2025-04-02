// import {PrimaryGeneratedColumn, Entity, Column, BeforeInsert, BaseEntity} from "typeorm";
// import {ulid} from "ulid";
// import {nanoid} from "nanoid";
//
// @Entity()
// export default class MinifiedUrl extends BaseEntity{
//     @PrimaryGeneratedColumn()
//     identifier: string
//
//     @Column()
//     originalUrl: string
//
//     @Column()
//     keyTag: string
//
//     @BeforeInsert()
//     setDefaults() {
//         this.identifier = ulid();
//         this.keyTag = nanoid(6);
//     }
// }