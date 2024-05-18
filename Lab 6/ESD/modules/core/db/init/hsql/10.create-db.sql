-- begin CINEMACHAIN_TICKET
create table CINEMACHAIN_TICKET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TICKET_NAME varchar(255) not null,
    PLACE integer,
    TICKET_ID varchar(255) not null,
    CINEMA_ID integer,
    TICKET_TIME time not null,
    COST integer,
    --
    primary key (ID)
)^
-- end CINEMACHAIN_TICKET
-- begin CINEMACHAIN_ORDER
create table CINEMACHAIN_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID varchar(36),
    TICKET_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CINEMACHAIN_ORDER
-- begin CINEMACHAIN_CLIENT
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
)^
-- end CINEMACHAIN_CLIENT
