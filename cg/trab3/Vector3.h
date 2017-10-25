/**
 * Vector3 class interface
 */

#ifndef VECTOR3_H
#define VECTOR3_H

#include <iostream>
#include <GL/glut.h>

using namespace std;

class Vector3 {

private:

public:
    GLfloat x, y, z;

    // Constructor
    Vector3(GLfloat x, GLfloat y, GLfloat z);

    // Destructor
    virtual ~Vector3();
};

#endif
