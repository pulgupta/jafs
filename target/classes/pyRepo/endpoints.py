from flask import Flask, Response, request

app = Flask(__name__)
default_name = 'Pulkit Gupta'

@app.route('/')
def hello_world():
	return 'If you can see this then your application is up and set up correctly!\n'

if __name__ == '__main__':
	app.run(debug=True, host='0.0.0.0')

