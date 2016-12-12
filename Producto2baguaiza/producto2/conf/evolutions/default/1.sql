# --- First database schema

# --- !Ups

create table pedi (
  id                        bigint not null,
  nombre                    varchar(255),
  descripcion               varchar(255),
  peso		                varchar(255),
  cantidad                  varchar(255),
  company_id                bigint,
  constraint pk_pedi primary key (id))
;

create sequence platotip_seq start with 1000;


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists pedi;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists pedi_seq;

