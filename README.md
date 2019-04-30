# J_JDBC_Postgres
JAVA Practice JDBC Postgres

對資料庫進行 插入 更新 查詢 Drop表 Create表，資料表名稱 Student，表欄位 name idno gender age phone

driver: postgresql-42.2.5
test environment: RHEL 7.6  JAVA 8

使用時須置入參數
java -jar J_JDBC_Postgres.jar <port> <dbname> <user> <pwd>

ex:
java -jar J_JDBC_Postgres.jar 5432 testdb admin pwd


