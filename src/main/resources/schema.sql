create table MAP (
    MAP_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    PATH VARCHAR(64) NOT NULL,
    NAME VARCHAR(64) NOT NULL
);

create table GAME (
    GAME_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    TURN SMALLINT NOT NULL,
    MAP_ID BIGINT NOT NULL
);

create table PLAYER (
    PLAYER_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    NICKNAME VARCHAR(64) NOT NULL,
    IS_MR_X BIT NOT NULL,
    CURRENT_NODE BIGINT NOT NULL,
    GAME_ID BIGINT NOT NULL,
    TURN_ORDER SMALLINT NOT NULL
);

create table GRAPH_NODE (
    NODE_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    NUMBER SMALLINT NOT NULL,
    PIXEL_X SMALLINT NOT NULL,
    PIXEL_Y SMALLINT NOT NULL,
    MAP_ID BIGINT NOT NULL
);

create table EDGE (
    EDGE_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    MAP_ID BIGINT NOT NULL,
    GRAPH_NODE_A BIGINT NOT NULL,
    GRAPH_NODE_B BIGINT NOT NULL,
    COLOUR_ID BIGINT NOT NULL
);

create table COLOUR (
    COLOUR_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    COLOUR_NAME VARCHAR(64)
);

ALTER TABLE PLAYER ADD FOREIGN KEY (CURRENT_NODE) REFERENCES GRAPH_NODE(NODE_ID);
ALTER TABLE PLAYER ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE GRAPH_NODE ADD FOREIGN KEY (MAP_ID) REFERENCES MAP(MAP_ID);
ALTER TABLE EDGE ADD FOREIGN KEY (MAP_ID) REFERENCES MAP(MAP_ID);
ALTER TABLE EDGE ADD FOREIGN KEY (GRAPH_NODE_A) REFERENCES GRAPH_NODE(NODE_ID);
ALTER TABLE EDGE ADD FOREIGN KEY (GRAPH_NODE_B) REFERENCES GRAPH_NODE(NODE_ID);
ALTER TABLE EDGE ADD FOREIGN KEY (COLOUR_ID) REFERENCES COLOUR(COLOUR_ID);