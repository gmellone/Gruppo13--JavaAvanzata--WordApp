/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.wordapp_g13.common.protocol;
/**
 *
 * @author angelo
 */
public enum TipoMessaggio {

    LOGIN_REQUEST,

    LOGIN_RESPONSE,

    REGISTER_REQUEST,

    REGISTER_RESPONSE,

    GET_DIFFICULTY_LOCK,

    DIFFICULTY_LOCK_RESP,

    START_GAME_REQUEST,
    
    CANCEL_GAME_REQUEST,
    
    GAME_STARTED,

    GUESS_ATTEMPT,

    GUESS_RESULT,

    HINT_REQUEST,

    HINT_RESPONSE,

    LEADERBOARD_REQUEST,

    LEADERBOARD_RESPONSE,

    HISTORY_REQUEST,

    HISTORY_RESPONSE,

    WAITING_FOR_OPPONENT,

    OPPONENT_DISCONNECTED,

    RECOVER_PASSWORD_REQUEST,

    RECOVER_PASSWORD_RESPONSE,

    RESET_PASSWORD_REQUEST,

    RESET_PASSWORD_RESPONSE,
    
    ERROR
}
