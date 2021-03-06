INSERT INTO STATUS(ID, NAME, CREATED_AT, UPDATED_AT) VALUES (1, 'Progress', SYSDATE, SYSDATE);
INSERT INTO STATUS(ID, NAME, CREATED_AT, UPDATED_AT) VALUES (2, 'Done', SYSDATE, SYSDATE);

INSERT INTO ACCOUNT(ID, NAME, USERNAME, PASSWORD, PHOTO, CREATED_AT, UPDATED_AT, REMOVED_AT) VALUES (SEQ_ACCOUNT.NEXTVAL, 'Joel Amálio', 'joelamalio', 'joelamalio', NULL, SYSDATE, SYSDATE, NULL);

INSERT INTO EDUCATIONAL_INSTITUTION (ID, NAME, CREATED_AT, UPDATED_AT, REMOVED_AT) VALUES (SEQ_EDUCATIONAL_INSTITUTION.NEXTVAL, 'Udemy', SYSDATE, SYSDATE, NULL);
INSERT INTO EDUCATIONAL_INSTITUTION (ID, NAME, CREATED_AT, UPDATED_AT, REMOVED_AT) VALUES (SEQ_EDUCATIONAL_INSTITUTION.NEXTVAL, 'Stanford University', SYSDATE, SYSDATE, NULL);
INSERT INTO EDUCATIONAL_INSTITUTION (ID, NAME, CREATED_AT, UPDATED_AT, REMOVED_AT) VALUES (SEQ_EDUCATIONAL_INSTITUTION.NEXTVAL, 'Massachusetts Institute of Technology', SYSDATE, SYSDATE, NULL);
INSERT INTO EDUCATIONAL_INSTITUTION (ID, NAME, CREATED_AT, UPDATED_AT, REMOVED_AT) VALUES (SEQ_EDUCATIONAL_INSTITUTION.NEXTVAL, 'Harvard University', SYSDATE, SYSDATE, NULL);
INSERT INTO EDUCATIONAL_INSTITUTION (ID, NAME, CREATED_AT, UPDATED_AT, REMOVED_AT) VALUES (SEQ_EDUCATIONAL_INSTITUTION.NEXTVAL, 'University of Michigan', SYSDATE, SYSDATE, NULL);

COMMIT;