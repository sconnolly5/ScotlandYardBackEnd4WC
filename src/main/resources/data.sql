INSERT INTO COLOUR (COLOUR_NAME) VALUES ('Yellow');
INSERT INTO COLOUR (COLOUR_NAME) VALUES ('Blue');
INSERT INTO COLOUR (COLOUR_NAME) VALUES ('Red');

INSERT INTO MAP (PATH, NAME) VALUES ('/map1.jpg', 'Small Preston');
INSERT INTO MAP (PATH, NAME) VALUES ('/map2.jpg', 'Medium Preston');
INSERT INTO MAP (PATH, NAME) VALUES ('/map3.jpg', 'Large Preston');

INSERT INTO GAME (TURN, MAP_ID) VALUES ('1', 1);

INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('1', '109', '101', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('2', '209', '87', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('3', '433', '58', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('4', '599', '39', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('5', '123', '355', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('6', '263', '321', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('7', '555', '251', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('8', '721', '200', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('9', '289', '416', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('10', '602', '315', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('11', '192', '528', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('12', '333', '499', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('13', '525', '444', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('14', '678', '408', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('15', '825', '345', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('16', '292', '714', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('17', '628', '624', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('18', '825', '585', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('19', '965', '499', '1');
INSERT INTO GRAPH_NODE (NUMBER, PIXEL_X, PIXEL_Y, MAP_ID) VALUES('20', '616', '743', '1');

INSERT INTO PLAYER (NICKNAME, IS_MR_X, CURRENT_NODE, GAME_ID, TURN_ORDER) VALUES('Sam',     '1', '1', '1', '0');
INSERT INTO PLAYER (NICKNAME, IS_MR_X, CURRENT_NODE, GAME_ID, TURN_ORDER) VALUES('Ollie',   '0', '2', '1', '1');
INSERT INTO PLAYER (NICKNAME, IS_MR_X, CURRENT_NODE, GAME_ID, TURN_ORDER) VALUES('Nick',    '0', '3', '1', '2');
INSERT INTO PLAYER (NICKNAME, IS_MR_X, CURRENT_NODE, GAME_ID, TURN_ORDER) VALUES('Lesley',  '0', '4', '1', '3');

INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '1', '2', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '1', '5', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '2', '3', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '2', '3', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '2', '6', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '2', '6', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '3', '4', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '3', '4', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '3', '7', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '4', '8', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '4', '7', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '5', '6', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '5', '6', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '5', '11', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '5', '11', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '6', '7', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '6', '7', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '6', '7', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '6', '9', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '6', '9', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '7', '8', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '7', '8', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '7', '10', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '7', '10', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '8', '14', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '8', '14', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '8', '15', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '9', '12', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '9', '12', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '10', '13', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '10', '13', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '10', '14', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '10', '14', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '11', '12', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '11', '12', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '11', '12', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '11', '16', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '11', '16', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '11', '16', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '12', '13', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '12', '13', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '12', '13', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '13', '14', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '13', '14', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '13', '14', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '13', '16', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '14', '15', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '14', '17', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '14', '17', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '14', '17', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '14', '18', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '14', '18', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '14', '18', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '15', '19', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '16', '17', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '16', '17', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '16', '17', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '17', '18', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '17', '18', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '17', '18', '3');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '17', '20', '1');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '17', '20', '2');
INSERT INTO EDGE (MAP_ID, GRAPH_NODE_A, GRAPH_NODE_B, COLOUR_ID) VALUES('1', '17', '19', '1');
