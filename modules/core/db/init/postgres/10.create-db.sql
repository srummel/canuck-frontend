-- begin EMAIL_MESSAGES
create table EMAIL_MESSAGES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_RECEIVED timestamp not null,
    SENT_BY varchar(255) not null,
    OTHER_RECIPIENTS text,
    CONTENT text not null,
    ATTACHMENTS bytea,
    --
    primary key (ID)
)^
-- end EMAIL_MESSAGES
