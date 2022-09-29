

from flask import Flask, render_template
app = Flask(__name__)    

@app.route('/play')          
def index():
    return render_template('index.html', boxes = 3, color = "cyan")

@app.route('/play/<int:number>')
def play_number(number):
    boxes = int(number)
    return render_template('index.html', boxes = boxes, color = "cyan")

@app.route('/play/<int:number>/<string:color>')
def play_color_int(number, color):
    boxes = int(number)
    bcolor=color
    return render_template('index.html', boxes = boxes, color = bcolor)





if __name__=="__main__":    
    app.run(debug=True) 