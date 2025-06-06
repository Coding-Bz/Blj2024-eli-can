cmake_minimum_required(VERSION 3.29)
project(20241024_SchiebepuzzleChallenge C)

set(CMAKE_C_STANDARD 11)

include_directories(.)

add_executable(20241024_SchiebepuzzleChallenge
    main.c
    utils.c
    utils.h)
