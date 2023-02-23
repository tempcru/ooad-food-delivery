const HtmlWebpackPlugin = require('html-webpack-plugin'); 
 
const path = require('path');

let resolve = (dir) => {return path.join(__dirname, '.', dir);} 

module.exports = {
    entry: './src/main/vue/main.js',
    output: {
        path: resolve('/src/main/resources/public'),
        filename: 'build.js',
    },
    resolve: {
        extensions: ['.js', '.vue', '.json'],
        alias: { 
            '@': path.resolve(__dirname, 'src/main/vue')
        } 
    },
    module: {
        rules:[
            { test: /\.js$/, use: 'babel-loader' },
            { test: /\.vue$/, use: 'vue-loader' },
            { test: /\.css$/, use: ['vue-style-loader', 'css-loader']},
            { test: /\.(png|jpg|svg)$/, use: 'file-loader'}
        ]
    },
    devServer: {
        hot: true,
        port: 9090,
        historyApiFallback: true
    },
    plugins: [new HtmlWebpackPlugin({
        template: resolve('/src/main/vue/index.html'),
        favicon: resolve('/src/main/vue/assets/logo.png'),
        filename: 'index.html',
        inject: true,
    })],

}

