db:
  image: mysql:8
  environment:
    MYSQL_ROOT_PASSWORD: root
    MYSQL_DATABASE: magasin
  ports:
    - "3306:3306"
  volumes:
    - db_data:/var/lib/mysql
    - ./database:/docker-entrypoint-initdb.d