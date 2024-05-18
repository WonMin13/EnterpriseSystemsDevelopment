create table CINEMACHAIN_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMAIL varchar(255) not null,
    CLIENT_NAME varchar(255),
    CARD_INFO varchar(255),
    CLIENT_ID varchar(255) not null,
    --
    primary key (ID)
);