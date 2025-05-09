import psycopg2
import os

def main():
    
    try:
        conn = psycopg2.connect(
            host="hadoop-04.uni.innopolis.ru",
            port=5432,
            user="team21",
            dbname="team21_projectdb",
            password=open("secrets/.psql.pass").read().strip()
        )
        print(conn)
        cur = conn.cursor()
        
        with open("sql/create_tables.sql", encoding='utf-8') as f:
            cur.execute(f.read())
        
        with open("data/flights.csv", encoding='utf-8') as f:
            cur.copy_expert("COPY flights FROM STDIN WITH CSV HEADER DELIMITER ',' NULL ''", f)
        
        conn.commit()
        print("Data imported successfully!")
        
    except Exception as e:
        print(f"Error: {e}")
        conn.rollback()
    finally:
        conn.close()

if __name__ == "__main__":
    main()

