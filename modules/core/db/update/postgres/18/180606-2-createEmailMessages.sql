create unique index IDX_EMAIL_MESSAGES_UK_DATE_RECEIVED on EMAIL_MESSAGES (DATE_RECEIVED) where DELETE_TS is null ;
