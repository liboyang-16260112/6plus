/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2020/3/27 9:34:15                            */
/*==============================================================*/


drop table if exists DataDictionary;

drop table if exists ParameterManager;

/*==============================================================*/
/* Table: DataDictionary                                        */
/*==============================================================*/
create table DataDictionary 
(
   dic_id               int(12)        auto_increment                not null,
   dic_type             varchar(32)                    null,
   dic_description      varchar(255)                   null,
   code                 int(24)                        null,
   constraint PK_DATADICTIONARY primary key clustered (dic_id)
);

/*==============================================================*/
/* Table: ParameterManager                                      */
/*==============================================================*/
create table ParameterManager 
(
   Parameter_id         int(12)         auto_increment               not null,
   Parameter_value      varchar(12)                    null,
   Parameter_description varchar(255)                   null,
   constraint PK_PARAMETERMANAGER primary key clustered (Parameter_id)
);

