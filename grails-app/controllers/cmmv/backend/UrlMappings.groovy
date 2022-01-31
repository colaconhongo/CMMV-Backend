package cmmv.backend

class UrlMappings {

    static mappings = {
        delete "/api/$controller/$id(.$format)?"(action:"delete")
        get "/api/$controller(.$format)?"(action:"index")
        get "/api/$controller/$id(.$format)?"(action:"show")
        post "/api/$controller(.$format)?"(action:"save")
        put "/api/$controller/$id(.$format)?"(action:"update")
        patch "/api/$controller/$id(.$format)?"(action:"patch")
       // patch "/api/secUser/$id(.$format)?"(controller:'secUser', action:'changePassword')
        // add mapping for Utente search by param systemNumber clinjc and appointment
        get "/api/utente/$systemNumber(.$format)?"(controller:'utente', action:'search')
        get "/api/utente/clinic/$id(.$format)?"(controller:'utente', action:'searchByClinicId')

        get "/api/clinic/utente/$utenteId(.$format)?"(controller:'utente', action:'searchClinicByUtente')
        get "/api/addresses/utente/$utenteId(.$format)?"(controller:'utente', action:'searchAddressesForUtente')

        get "/api/appointment/clinic/$id(.$format)?"(controller:'appointment', action:'searcAppointmentsByClinicId')
        get "/api/utente/appointment/$appointmentId(.$format)?"(controller:'appointment', action:'searcAppointmentsByClinicId')

        get "/api/utente/communityMobilizer/$communityMobilizerId(.$format)?"(controller:'utente', action:'searchByMobilizerId')
        get "/api/communityMobilizer/district/$districtId(.$format)?"(controller:'communityMobilizer', action:'searchByDistrictId')
        get "/api/clinic/district/$districtId(.$format)?"(controller:'clinic', action:'searchClinicsByDistrictId')
        get "/api/appointment/clinic/$id(.$format)?"(controller:'appointment', action:'searchAppointmentsByClinicAndDates')
        get "/api/userLogin/clinic/$clinicId(.$format)?"(controller:'userLogin', action:'searchAllUsersByClinicId')
        get "/api/districtUserLogin/district/$districtId(.$format)?"(controller:'districtUserLogin', action:'searchAllUsersByDistrictId')
        "/"(view:"/login/auth")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
