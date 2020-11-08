import i18n from 'i18next';
import {initReactI18next} from 'react-i18next';
import LngDetector from 'i18next-browser-languagedetector';

i18n.use(initReactI18next).use(LngDetector).init({
    // debug: true,
    resources:{
        en:{
            translation: {
                'Sign Up':'Sign Up',
                'Username' : 'Username',
                'Display Name' : 'Display Name',
                'Password' : 'Password',
                'Password Repeat' : 'Password Repeat',
                'Password mismatch' :'Password mismatch'
            }
        },
        tr:{
            translation: {
                'Sign Up':'Kayıt Ol',
                'Username' : 'Kullanıcı Adı',
                'Display Name' : 'Görünen Adı',
                'Password' : 'Parola',
                'Password Repeat' :'Parolayı Tekrarla',
                'Password mismatch' : 'Parola Eşleşmedi'
            }
        },
        fallbackLng: ['common', 'tr'],
        lng:'tr',
        ns:['translation'],
        defaultNS:'translation',
        keySeparator:false,
        interpolation:{
            escapeValue:false,
            formatSeparator:','
        },
        react:{
            wait:true
        }
    }
});

export default i18n;