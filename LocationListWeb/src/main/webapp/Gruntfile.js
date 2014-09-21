module.exports = function (grunt) {

    // Project configuration.
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        uglify: {
            options: {
                banner: '/*! <%= pkg.name %> <%= grunt.template.today("yyyy-mm-dd") %> */\n'
            },
            build: {
                src: 'src/<%= pkg.name %>.js',
                dest: 'build/<%= pkg.name %>.min.js'
            }
        },
        wiredep: {
            target: {
                src: [
                    'index.html'   // .html support...
                    //'app/views/**/*.jade',   // .jade support...
                    //'app/styles/main.scss',  // .scss & .sass support...
                    //'app/config.yml'         // and .yml & .yaml support out of the box!
                ],

                options: {
                    cwd: '',
                    dependencies: true,
                    devDependencies: false,
                    exclude: [],
                    fileTypes: {},
                    ignorePath: '',
                    overrides: {}
                }
            }
        }
    });

    grunt.loadNpmTasks('grunt-wiredep');

    // Load the plugin that provides the "uglify" task.
    grunt.loadNpmTasks('grunt-contrib-uglify');

    // Default task(s).
    grunt.registerTask('default', ['uglify']);
};