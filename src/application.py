#encoding:utf-8
#!flask/bin/python
from flask import Flask
from flaskrun import flaskrun

application = Flask(__name__)


@application.route('/', methods=['GET'])
def get():
    return '{"Output":"Hello World.ccth==长城天和"}'


@application.route('/', methods=['POST'])
def post():
    return '{"Output":"Hello World"}'

if __name__ == '__main__':
    flaskrun(application)
