#define LOG_LEVEL 2
#include "ctarget.h"
#define NUMBER_OF_FEDERATES 1
#include "core/reactor_threaded.c"
// Code generated by the Lingua Franca compiler from file:
// C:\Users\soyer\lingua-franca-master\git\lingua-franca\benchmark\C\Savina\PingPongThreaded.lf
// =============== START reactor class Pong
#line 47 "file:C:\\Users\\soyer\\lingua-franca-master\\git\\lingua-franca\\benchmark\\C\\Savina\\PingPongThreaded.lf"
typedef struct {
typedef struct {
    int bank_index;
    int expected;
    int count;
    pong_receive_t* __receive;
    // width of -2 indicates that it is not a multiport.
    int __receive__width;
    // Default input (in case it does not get connected)
    pong_receive_t __default__receive;
    pong_send_t __send;
    int __send__width;
    reaction_t ___reaction_0;
    reaction_t ___reaction_1;
    trigger_t ___shutdown;
    reaction_t* ___shutdown_reactions[1];
    trigger_t ___receive;
    reaction_t* ___receive_reactions[1];
} pong_self_t;
void pongreaction_function_0(void* instance_args) {
    #pragma GCC diagnostic push
    #pragma GCC diagnostic ignored "-Wunused-variable"
    pong_self_t* self = (pong_self_t*)instance_args;
    #pragma GCC diagnostic pop
    pong_receive_t* receive = self->__receive;
    #pragma GCC diagnostic push
    #pragma GCC diagnostic ignored "-Wunused-variable"
    int receive_width = self->__receive__width;
    #pragma GCC diagnostic pop
    pong_send_t* send = &self->__send;
    SET(send, receive->value);   
        
}
void pongreaction_function_1(void* instance_args) {
    #pragma GCC diagnostic push
    #pragma GCC diagnostic ignored "-Wunused-variable"
    pong_self_t* self = (pong_self_t*)instance_args;
    #pragma GCC diagnostic pop
        fprintf(stderr, "Pong expected to receive %d inputs, but it received %d.\n",
            self->expected, self->count
        );
        exit(1);
    }
    printf("Success.\n");
        
}
pong_self_t* new_Pong() {
    pong_self_t* self = (pong_self_t*)calloc(1, sizeof(pong_self_t));
    // Set input by default to an always absent default input.
    self->__receive = &self->__default__receive;
    self->___reaction_0.number = 0;
    self->___reaction_0.function = pongreaction_function_0;
    self->___reaction_0.self = self;
    self->___reaction_0.deadline_violation_handler = NULL;
    self->___reaction_0.tardy_handler = NULL;
    self->___reaction_1.number = 1;
    self->___reaction_1.function = pongreaction_function_1;
    self->___reaction_1.self = self;
    self->___reaction_1.deadline_violation_handler = NULL;
    self->___reaction_1.tardy_handler = NULL;
    self->___shutdown_reactions[0] = &self->___reaction_1;
    self->___shutdown.last = NULL;
    self->___shutdown.reactions = &self->___shutdown_reactions[0];
    self->___shutdown.number_of_reactions = 1;
    self->___shutdown.is_timer = false;
    self->___receive.last = NULL;
    self->___receive_reactions[0] = &self->___reaction_0;
    self->___receive.reactions = &self->___receive_reactions[0];
    self->___receive.number_of_reactions = 1;
    self->___receive.element_size = sizeof(int);
    return self;
}
void delete_Pong(pong_self_t* self) {
    if (self->___reaction_0.output_produced != NULL) {
        free(self->___reaction_0.output_produced);
    }
    if (self->___reaction_0.triggers != NULL) {
        free(self->___reaction_0.triggers);
    }
    if (self->___reaction_0.triggered_sizes != NULL) {
        free(self->___reaction_0.triggered_sizes);
    }
    if (self->___reaction_1.output_produced != NULL) {
        free(self->___reaction_1.output_produced);
    }
    if (self->___reaction_1.triggers != NULL) {
        free(self->___reaction_1.triggers);
    }
    if (self->___reaction_1.triggered_sizes != NULL) {
        free(self->___reaction_1.triggered_sizes);
    }
    for(int i = 0; i < self->___reaction_0.num_outputs; i++) {
        free(self->___reaction_0.triggers[i]);
    }
    for(int i = 0; i < self->___reaction_1.num_outputs; i++) {
        free(self->___reaction_1.triggers[i]);
    }
    free(self);
}
// =============== END reactor class Pong

// =============== START reactor class Ping
#line 31 "file:C:\\Users\\soyer\\lingua-franca-master\\git\\lingua-franca\\benchmark\\C\\Savina\\PingPongThreaded.lf"
typedef struct {
typedef struct {
    int bank_index;
    int count;
    int pingsLeft;
    ping_serve_t __serve;
    ping_receive_t* __receive;
    // width of -2 indicates that it is not a multiport.
    int __receive__width;
    // Default input (in case it does not get connected)
    ping_receive_t __default__receive;
    ping_send_t __send;
    int __send__width;
    reaction_t ___reaction_0;
    reaction_t ___reaction_1;
    trigger_t ___startup;
    reaction_t* ___startup_reactions[1];
    trigger_t ___serve;
    reaction_t* ___serve_reactions[1];
    trigger_t ___receive;
    reaction_t* ___receive_reactions[1];
} ping_self_t;
void pingreaction_function_0(void* instance_args) {
    #pragma GCC diagnostic push
    #pragma GCC diagnostic ignored "-Wunused-variable"
    ping_self_t* self = (ping_self_t*)instance_args;
    #pragma GCC diagnostic pop
    ping_send_t* send = &self->__send;
        
}
void pingreaction_function_1(void* instance_args) {
    #pragma GCC diagnostic push
    #pragma GCC diagnostic ignored "-Wunused-variable"
    ping_self_t* self = (ping_self_t*)instance_args;
    #pragma GCC diagnostic pop
    ping_receive_t* receive = self->__receive;
    #pragma GCC diagnostic push
    #pragma GCC diagnostic ignored "-Wunused-variable"
    int receive_width = self->__receive__width;
    #pragma GCC diagnostic pop
    ping_serve_t* serve = &self->__serve;
        schedule(serve, 0);
    } else {
        request_stop();
    }
        
}
ping_self_t* new_Ping() {
    ping_self_t* self = (ping_self_t*)calloc(1, sizeof(ping_self_t));
    self->__serve.trigger = &self->___serve;
    // Set input by default to an always absent default input.
    self->__receive = &self->__default__receive;
    self->___reaction_0.number = 0;
    self->___reaction_0.function = pingreaction_function_0;
    self->___reaction_0.self = self;
    self->___reaction_0.deadline_violation_handler = NULL;
    self->___reaction_0.tardy_handler = NULL;
    self->___reaction_1.number = 1;
    self->___reaction_1.function = pingreaction_function_1;
    self->___reaction_1.self = self;
    self->___reaction_1.deadline_violation_handler = NULL;
    self->___reaction_1.tardy_handler = NULL;
    self->___startup_reactions[0] = &self->___reaction_0;
    self->___startup.last = NULL;
    self->___startup.reactions = &self->___startup_reactions[0];
    self->___startup.number_of_reactions = 1;
    self->___startup.is_timer = false;
    self->___serve.last = NULL;
    self->___serve_reactions[0] = &self->___reaction_0;
    self->___serve.reactions = &self->___serve_reactions[0];
    self->___serve.number_of_reactions = 1;
    self->___serve.is_physical = false;
    self->___serve.element_size = 0;
    self->___receive.last = NULL;
    self->___receive_reactions[0] = &self->___reaction_1;
    self->___receive.reactions = &self->___receive_reactions[0];
    self->___receive.number_of_reactions = 1;
    self->___receive.element_size = sizeof(int);
    return self;
}
void delete_Ping(ping_self_t* self) {
    if (self->___reaction_0.output_produced != NULL) {
        free(self->___reaction_0.output_produced);
    }
    if (self->___reaction_0.triggers != NULL) {
        free(self->___reaction_0.triggers);
    }
    if (self->___reaction_0.triggered_sizes != NULL) {
        free(self->___reaction_0.triggered_sizes);
    }
    if (self->___reaction_1.output_produced != NULL) {
        free(self->___reaction_1.output_produced);
    }
    if (self->___reaction_1.triggers != NULL) {
        free(self->___reaction_1.triggers);
    }
    if (self->___reaction_1.triggered_sizes != NULL) {
        free(self->___reaction_1.triggered_sizes);
    }
    for(int i = 0; i < self->___reaction_0.num_outputs; i++) {
        free(self->___reaction_0.triggers[i]);
    }
    for(int i = 0; i < self->___reaction_1.num_outputs; i++) {
        free(self->___reaction_1.triggers[i]);
    }
    free(self);
}
// =============== END reactor class Ping

// =============== START reactor class PingPong
typedef struct {
    int bank_index;
} pingpong_self_t;
pingpong_self_t* new_PingPong() {
    pingpong_self_t* self = (pingpong_self_t*)calloc(1, sizeof(pingpong_self_t));
    return self;
}
void delete_PingPong(pingpong_self_t* self) {
    free(self);
}
// =============== END reactor class PingPong

char* __default_argv[] = {"PingPongThreaded", "-f", "true"};
void __set_default_command_line_options() {
    default_argc = 3;
    default_argv = __default_argv;
}
// Array of pointers to timer triggers to be scheduled in __initialize_timers().
trigger_t** __timer_triggers = NULL;
int __timer_triggers_size = 0;
// Array of pointers to timer triggers to be scheduled in __trigger_startup_reactions().
reaction_t* __startup_reactions[1];
int __startup_reactions_size = 1;
// Array of pointers to shutdown triggers.
reaction_t* __shutdown_reactions[1];
int __shutdown_reactions_size = 1;
trigger_t* __action_for_port(int port_id) {
    return NULL;
}
void __initialize_trigger_objects() {
    __tokens_with_ref_count_size = 1;
    __tokens_with_ref_count = (token_present_t*)malloc(1 * sizeof(token_present_t));
    // Create the array that will contain pointers to is_present fields to reset on each step.
    __is_present_fields_size = 3;
    __is_present_fields = (bool**)malloc(3 * sizeof(bool*));
    // ************* Instance PingPong of class PingPong
    pingpong_self_t* pingpong_self = new_PingPong();
    //***** Start initializing PingPong
    // ************* Instance PingPong.ping of class Ping
    ping_self_t* pingpong_ping_self = new_Ping();
    //***** Start initializing PingPong.ping
    pingpong_ping_self->count = 1000000; 
    // width of -2 indicates that it is not a multiport.
    pingpong_ping_self->__send__width = -2;
    __startup_reactions[0] = &pingpong_ping_self->___reaction_0;
    // width of -2 indicates that it is not a multiport.
    pingpong_ping_self->__receive__width = -2;
    pingpong_ping_self->pingsLeft = pingpong_ping_self->count;
    pingpong_ping_self->___serve.offset = 0;
    pingpong_ping_self->___serve.period = -1;
    pingpong_ping_self->___serve.token = __create_token(0);
    pingpong_ping_self->___serve.is_present = false;
    __tokens_with_ref_count[0].token
            = &pingpong_ping_self->___serve.token;
    __tokens_with_ref_count[0].is_present
            = &pingpong_ping_self->___serve.is_present;
    __tokens_with_ref_count[0].reset_is_present = true;
    //***** End initializing PingPong.ping
    // ************* Instance PingPong.pong of class Pong
    pong_self_t* pingpong_pong_self = new_Pong();
    //***** Start initializing PingPong.pong
    pingpong_pong_self->expected = 1000000; 
    // width of -2 indicates that it is not a multiport.
    pingpong_pong_self->__send__width = -2;
    __shutdown_reactions[0] = &pingpong_pong_self->___reaction_1;
    // width of -2 indicates that it is not a multiport.
    pingpong_pong_self->__receive__width = -2;
    static int pingpong_pong_initial_count = 0;
    pingpong_pong_self->count = pingpong_pong_initial_count;
    //***** End initializing PingPong.pong
    //***** End initializing PingPong
    // Populate arrays of trigger pointers.
    pingpong_self->bank_index = 0;
    pingpong_ping_self->bank_index = 0;
    // Total number of outputs produced by the reaction.
    pingpong_ping_self->___reaction_0.num_outputs = 1;
    // Allocate arrays for triggering downstream reactions.
    if (pingpong_ping_self->___reaction_0.num_outputs > 0) {
        pingpong_ping_self->___reaction_0.output_produced = (bool**)malloc(sizeof(bool*) * pingpong_ping_self->___reaction_0.num_outputs);
        pingpong_ping_self->___reaction_0.triggers = (trigger_t***)malloc(sizeof(trigger_t**) * pingpong_ping_self->___reaction_0.num_outputs);
        pingpong_ping_self->___reaction_0.triggered_sizes = (int*)malloc(sizeof(int) * pingpong_ping_self->___reaction_0.num_outputs);
    }
    // Initialize the output_produced array.
    pingpong_ping_self->___reaction_0.output_produced[0]
    = &pingpong_ping_self->__send.is_present
    ;
    // Total number of outputs produced by the reaction.
    pingpong_ping_self->___reaction_1.num_outputs = 0;
    // Allocate arrays for triggering downstream reactions.
    if (pingpong_ping_self->___reaction_1.num_outputs > 0) {
        pingpong_ping_self->___reaction_1.output_produced = (bool**)malloc(sizeof(bool*) * pingpong_ping_self->___reaction_1.num_outputs);
        pingpong_ping_self->___reaction_1.triggers = (trigger_t***)malloc(sizeof(trigger_t**) * pingpong_ping_self->___reaction_1.num_outputs);
        pingpong_ping_self->___reaction_1.triggered_sizes = (int*)malloc(sizeof(int) * pingpong_ping_self->___reaction_1.num_outputs);
    }
    // Initialize the output_produced array.
    // Reaction 0 of PingPong.ping does not depend on one maximal upstream reaction.
    pingpong_ping_self->___reaction_0.last_enabling_reaction = NULL;
    // Reaction 0 of PingPong.ping triggers 1 downstream reactions through port PingPong.ping.send.
    pingpong_ping_self->___reaction_0.triggered_sizes[0] = 1;
    // For reaction 0 of PingPong.ping, allocate an
    // array of trigger pointers for downstream reactions through port PingPong.ping.send
    trigger_t** pingpong_ping_0_0 = (trigger_t**)malloc(1 * sizeof(trigger_t*));
    pingpong_ping_self->___reaction_0.triggers[0] = pingpong_ping_0_0;
    // Point to destination port PingPong.pong.receive's trigger struct.
    pingpong_ping_0_0[0] = &pingpong_pong_self->___receive;
    // Reaction 1 of PingPong.ping depends on one maximal upstream reaction.
    pingpong_ping_self->___reaction_1.last_enabling_reaction = &(pingpong_pong_self->___reaction_0);
    pingpong_ping_self->__send.num_destinations
    = 1;
    pingpong_pong_self->bank_index = 0;
    // Total number of outputs produced by the reaction.
    pingpong_pong_self->___reaction_0.num_outputs = 1;
    // Allocate arrays for triggering downstream reactions.
    if (pingpong_pong_self->___reaction_0.num_outputs > 0) {
        pingpong_pong_self->___reaction_0.output_produced = (bool**)malloc(sizeof(bool*) * pingpong_pong_self->___reaction_0.num_outputs);
        pingpong_pong_self->___reaction_0.triggers = (trigger_t***)malloc(sizeof(trigger_t**) * pingpong_pong_self->___reaction_0.num_outputs);
        pingpong_pong_self->___reaction_0.triggered_sizes = (int*)malloc(sizeof(int) * pingpong_pong_self->___reaction_0.num_outputs);
    }
    // Initialize the output_produced array.
    pingpong_pong_self->___reaction_0.output_produced[0]
    = &pingpong_pong_self->__send.is_present
    ;
    // Total number of outputs produced by the reaction.
    pingpong_pong_self->___reaction_1.num_outputs = 0;
    // Allocate arrays for triggering downstream reactions.
    if (pingpong_pong_self->___reaction_1.num_outputs > 0) {
        pingpong_pong_self->___reaction_1.output_produced = (bool**)malloc(sizeof(bool*) * pingpong_pong_self->___reaction_1.num_outputs);
        pingpong_pong_self->___reaction_1.triggers = (trigger_t***)malloc(sizeof(trigger_t**) * pingpong_pong_self->___reaction_1.num_outputs);
        pingpong_pong_self->___reaction_1.triggered_sizes = (int*)malloc(sizeof(int) * pingpong_pong_self->___reaction_1.num_outputs);
    }
    // Initialize the output_produced array.
    // Reaction 0 of PingPong.pong depends on one maximal upstream reaction.
    pingpong_pong_self->___reaction_0.last_enabling_reaction = &(pingpong_ping_self->___reaction_0);
    // Reaction 0 of PingPong.pong triggers 1 downstream reactions through port PingPong.pong.send.
    pingpong_pong_self->___reaction_0.triggered_sizes[0] = 1;
    // For reaction 0 of PingPong.pong, allocate an
    // array of trigger pointers for downstream reactions through port PingPong.pong.send
    trigger_t** pingpong_pong_0_0 = (trigger_t**)malloc(1 * sizeof(trigger_t*));
    pingpong_pong_self->___reaction_0.triggers[0] = pingpong_pong_0_0;
    // Point to destination port PingPong.ping.receive's trigger struct.
    pingpong_pong_0_0[0] = &pingpong_ping_self->___receive;
    // Reaction 1 of PingPong.pong depends on one maximal upstream reaction.
    pingpong_pong_self->___reaction_1.last_enabling_reaction = &(pingpong_pong_self->___reaction_0);
    pingpong_pong_self->__send.num_destinations
    = 1;
    // doDeferredInitialize
    // Connect inputs and outputs for reactor PingPong.
    // Connect PingPong.ping.send to input port PingPong.pong.receive
    pingpong_pong_self->__receive = (pong_receive_t*)&pingpong_ping_self->__send;
    // Connect PingPong.pong.send to input port PingPong.ping.receive
    pingpong_ping_self->__receive = (ping_receive_t*)&pingpong_pong_self->__send;
    // Connect inputs and outputs for reactor PingPong.ping.
    // END Connect inputs and outputs for reactor PingPong.ping.
    // Connect inputs and outputs for reactor PingPong.pong.
    // END Connect inputs and outputs for reactor PingPong.pong.
    // END Connect inputs and outputs for reactor PingPong.
    // Add action PingPong.ping.serve to array of is_present fields.
    __is_present_fields[0] 
            = &pingpong_ping_self->__serve.is_present;
    // Add port PingPong.ping.send to array of is_present fields.
    __is_present_fields[1] = &pingpong_ping_self->__send.is_present
    ;
    // Add port PingPong.pong.send to array of is_present fields.
    __is_present_fields[2] = &pingpong_pong_self->__send.is_present
    ;
    pingpong_ping_self->___reaction_0.chain_id = 7;
    // index is the OR of level 0 and 
    // deadline 140737488355327 shifted left 16 bits.
    pingpong_ping_self->___reaction_0.index = 0x7fffffffffff0000LL;
    pingpong_ping_self->___reaction_1.chain_id = 3;
    // index is the OR of level 2 and 
    // deadline 140737488355327 shifted left 16 bits.
    pingpong_ping_self->___reaction_1.index = 0x7fffffffffff0002LL;
    pingpong_pong_self->___reaction_0.chain_id = 5;
    // index is the OR of level 1 and 
    // deadline 140737488355327 shifted left 16 bits.
    pingpong_pong_self->___reaction_0.index = 0x7fffffffffff0001LL;
    pingpong_pong_self->___reaction_1.chain_id = 5;
    // index is the OR of level 2 and 
    // deadline 140737488355327 shifted left 16 bits.
    pingpong_pong_self->___reaction_1.index = 0x7fffffffffff0002LL;
    calculate_epoch_offset();
}
void __trigger_startup_reactions() {
    if (_lf_number_of_threads == 0) {
       _lf_number_of_threads = 8;
    }
    for (int i = 0; i < __startup_reactions_size; i++) {
        if (__startup_reactions[i] != NULL) {
            _lf_enqueue_reaction(__startup_reactions[i]);
        }
    }
}
void __initialize_timers() {
}
void logical_tag_complete(tag_t tag_to_send) {
}
tag_t send_next_event_tag(tag_t tag, bool wait_for_reply) {
    return tag;
}
bool __trigger_shutdown_reactions() {                          
    for (int i = 0; i < __shutdown_reactions_size; i++) {
        if (__shutdown_reactions[i] != NULL) {
            _lf_enqueue_reaction(__shutdown_reactions[i]);
        }
    }
    // Return true if there are shutdown reactions.
    return (__shutdown_reactions_size > 0);
}
void __termination() {stop_trace();}
