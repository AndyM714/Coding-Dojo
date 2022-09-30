from operator import methodcaller
from flask import Flask, render_template, request, redirect, session
app = Flask(__name__)
app.secret_key = 'counts'

@app.route('/')
def index():
    session['count'] = 1
    session['visits'] = 1
    return render_template('index.html')


@app.route('/count', methods=['post'])
def count():
    session['count'] += 1
    session['visits'] += 1
    return render_template('index.html')

@app.route('/reset', methods=['post'])
def destroy_session():
    return redirect('/')







if __name__=="__main__":
    app.run(debug=True) 