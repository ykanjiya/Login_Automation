import sys

def main(application_name, ip_or_hostname, username):
    # Your logic here
    print(f"Connecting to {application_name} with IP/Hostname: {ip_or_hostname} and Username: {username}")

if __name__ == "__main__":
    if len(sys.argv) != 4:
        print("Usage: python connect_script.py <application_name> <ip_or_hostname> <username>")
    else:
        app_name = sys.argv[1]
        ip_hostname = sys.argv[2]
        user = sys.argv[3]
        main(app_name, ip_hostname, user)
