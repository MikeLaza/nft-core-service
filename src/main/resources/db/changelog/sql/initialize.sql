create table if not exists nft
(
    id      varchar (128) not null
        constraint nft_privary_key primary key,
    token   varchar (255) unique
);